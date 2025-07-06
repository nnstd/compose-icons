package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RepeatOnce: ImageVector
    get() {
        if (_RepeatOnce != null) {
            return _RepeatOnce!!
        }
        _RepeatOnce = ImageVector.Builder(
            name = "RepeatOnce",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 15f)
                verticalLineTo(9f)
                horizontalLineTo(12f)
                lineTo(10f, 10f)
                verticalLineTo(11f)
                horizontalLineTo(11.5f)
                verticalLineTo(15f)
                moveTo(17f, 17f)
                horizontalLineTo(7f)
                verticalLineTo(14f)
                lineTo(3f, 18f)
                lineTo(7f, 22f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                horizontalLineTo(17f)
                moveTo(7f, 7f)
                horizontalLineTo(17f)
                verticalLineTo(10f)
                lineTo(21f, 6f)
                lineTo(17f, 2f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _RepeatOnce!!
    }

@Suppress("ObjectPropertyName")
private var _RepeatOnce: ImageVector? = null
