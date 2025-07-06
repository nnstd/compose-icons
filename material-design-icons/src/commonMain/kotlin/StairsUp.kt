package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StairsUp: ImageVector
    get() {
        if (_StairsUp != null) {
            return _StairsUp!!
        }
        _StairsUp = ImageVector.Builder(
            name = "StairsUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 6f)
                horizontalLineTo(22f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                moveTo(10.17f, 6.66f)
                lineTo(4.66f, 12.17f)
                lineTo(2.83f, 10.34f)
                lineTo(8.34f, 4.83f)
                lineTo(6.5f, 3f)
                horizontalLineTo(12f)
                verticalLineTo(8.5f)
                lineTo(10.17f, 6.66f)
                close()
            }
        }.build()

        return _StairsUp!!
    }

@Suppress("ObjectPropertyName")
private var _StairsUp: ImageVector? = null
