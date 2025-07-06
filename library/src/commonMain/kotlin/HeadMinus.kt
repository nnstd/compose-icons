package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeadMinus: ImageVector
    get() {
        if (_HeadMinus != null) {
            return _HeadMinus!!
        }
        _HeadMinus = ImageVector.Builder(
            name = "HeadMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 3f)
                curveTo(9.2f, 3f, 6.2f, 5.9f, 6f, 9.7f)
                lineTo(4.1f, 12.2f)
                curveTo(3.9f, 12.5f, 4.1f, 13f, 4.5f, 13f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                curveTo(6f, 17.1f, 6.9f, 18f, 8f, 18f)
                horizontalLineTo(9f)
                verticalLineTo(21f)
                horizontalLineTo(16f)
                verticalLineTo(16.3f)
                curveTo(18.4f, 15.2f, 20f, 12.8f, 20f, 10f)
                curveTo(20f, 6.1f, 16.9f, 3f, 13f, 3f)
                moveTo(17f, 10f)
                horizontalLineTo(9f)
                verticalLineTo(8f)
                horizontalLineTo(17f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _HeadMinus!!
    }

@Suppress("ObjectPropertyName")
private var _HeadMinus: ImageVector? = null
