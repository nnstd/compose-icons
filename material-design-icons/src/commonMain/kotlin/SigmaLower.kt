package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SigmaLower: ImageVector
    get() {
        if (_SigmaLower != null) {
            return _SigmaLower!!
        }
        _SigmaLower = ImageVector.Builder(
            name = "SigmaLower",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 12f)
                curveTo(19f, 16.42f, 15.64f, 20f, 11.5f, 20f)
                curveTo(7.36f, 20f, 4f, 16.42f, 4f, 12f)
                curveTo(4f, 7.58f, 7.36f, 4f, 11.5f, 4f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                horizontalLineTo(16.46f)
                curveTo(18f, 7.47f, 19f, 9.61f, 19f, 12f)
                moveTo(11.5f, 6f)
                curveTo(8.46f, 6f, 6f, 8.69f, 6f, 12f)
                curveTo(6f, 15.31f, 8.46f, 18f, 11.5f, 18f)
                curveTo(14.54f, 18f, 17f, 15.31f, 17f, 12f)
                curveTo(17f, 8.69f, 14.54f, 6f, 11.5f, 6f)
                close()
            }
        }.build()

        return _SigmaLower!!
    }

@Suppress("ObjectPropertyName")
private var _SigmaLower: ImageVector? = null
