package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Highway: ImageVector
    get() {
        if (_Highway != null) {
            return _Highway!!
        }
        _Highway = ImageVector.Builder(
            name = "Highway",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 2f)
                lineTo(8f, 8f)
                horizontalLineTo(11f)
                verticalLineTo(2f)
                horizontalLineTo(10f)
                moveTo(13f, 2f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                lineTo(14f, 2f)
                horizontalLineTo(13f)
                moveTo(2f, 9f)
                verticalLineTo(10f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                horizontalLineTo(6f)
                verticalLineTo(10f)
                horizontalLineTo(18f)
                lineTo(18.06f, 11f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                horizontalLineTo(22f)
                verticalLineTo(9f)
                horizontalLineTo(2f)
                moveTo(7f, 11f)
                lineTo(3.34f, 22f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                moveTo(13f, 11f)
                verticalLineTo(22f)
                horizontalLineTo(20.66f)
                lineTo(17f, 11f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _Highway!!
    }

@Suppress("ObjectPropertyName")
private var _Highway: ImageVector? = null
