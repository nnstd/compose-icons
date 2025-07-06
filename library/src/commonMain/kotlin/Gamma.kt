package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Gamma: ImageVector
    get() {
        if (_Gamma != null) {
            return _Gamma!!
        }
        _Gamma = ImageVector.Builder(
            name = "Gamma",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.76f, 19f)
                curveTo(12.92f, 19f, 13.58f, 18f, 13.58f, 16.29f)
                curveTo(13.58f, 15.2f, 13.5f, 13.88f, 13.3f, 12.67f)
                lineTo(18f, 5f)
                horizontalLineTo(15.28f)
                lineTo(12.71f, 9.82f)
                lineTo(12.55f, 9.33f)
                curveTo(11.83f, 7.19f, 10.82f, 5f, 8.68f, 5f)
                curveTo(8f, 5f, 7.45f, 5.18f, 7f, 5.54f)
                curveTo(6f, 6.39f, 6f, 8f, 6f, 8.5f)
                horizontalLineTo(6.91f)
                curveTo(6.97f, 8.06f, 7.21f, 6.83f, 8.25f, 6.83f)
                curveTo(10f, 6.83f, 10.8f, 10f, 11.4f, 12.42f)
                curveTo(10.5f, 14.58f, 10f, 16.14f, 10f, 16.97f)
                curveTo(10f, 17.95f, 10.56f, 19f, 11.76f, 19f)
            }
        }.build()

        return _Gamma!!
    }

@Suppress("ObjectPropertyName")
private var _Gamma: ImageVector? = null
