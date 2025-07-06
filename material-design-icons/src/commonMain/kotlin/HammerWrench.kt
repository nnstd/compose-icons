package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HammerWrench: ImageVector
    get() {
        if (_HammerWrench != null) {
            return _HammerWrench!!
        }
        _HammerWrench = ImageVector.Builder(
            name = "HammerWrench",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.78f, 15.3f)
                lineTo(19.78f, 21.3f)
                lineTo(21.89f, 19.14f)
                lineTo(15.89f, 13.14f)
                lineTo(13.78f, 15.3f)
                moveTo(17.5f, 10.1f)
                curveTo(17.11f, 10.1f, 16.69f, 10.05f, 16.36f, 9.91f)
                lineTo(4.97f, 21.25f)
                lineTo(2.86f, 19.14f)
                lineTo(10.27f, 11.74f)
                lineTo(8.5f, 9.96f)
                lineTo(7.78f, 10.66f)
                lineTo(6.33f, 9.25f)
                verticalLineTo(12.11f)
                lineTo(5.63f, 12.81f)
                lineTo(2.11f, 9.25f)
                lineTo(2.81f, 8.55f)
                horizontalLineTo(5.62f)
                lineTo(4.22f, 7.14f)
                lineTo(7.78f, 3.58f)
                curveTo(8.95f, 2.41f, 10.83f, 2.41f, 12f, 3.58f)
                lineTo(9.89f, 5.74f)
                lineTo(11.3f, 7.14f)
                lineTo(10.59f, 7.85f)
                lineTo(12.38f, 9.63f)
                lineTo(14.2f, 7.75f)
                curveTo(14.06f, 7.42f, 14f, 7f, 14f, 6.63f)
                curveTo(14f, 4.66f, 15.56f, 3.11f, 17.5f, 3.11f)
                curveTo(18.09f, 3.11f, 18.61f, 3.25f, 19.08f, 3.53f)
                lineTo(16.41f, 6.2f)
                lineTo(17.91f, 7.7f)
                lineTo(20.58f, 5.03f)
                curveTo(20.86f, 5.5f, 21f, 6f, 21f, 6.63f)
                curveTo(21f, 8.55f, 19.45f, 10.1f, 17.5f, 10.1f)
                close()
            }
        }.build()

        return _HammerWrench!!
    }

@Suppress("ObjectPropertyName")
private var _HammerWrench: ImageVector? = null
