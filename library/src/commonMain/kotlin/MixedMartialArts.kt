package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MixedMartialArts: ImageVector
    get() {
        if (_MixedMartialArts != null) {
            return _MixedMartialArts!!
        }
        _MixedMartialArts = ImageVector.Builder(
            name = "MixedMartialArts",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 10f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(10f)
                horizontalLineTo(15f)
                moveTo(18f, 7f)
                curveTo(18.28f, 7f, 18.5f, 7.09f, 18.7f, 7.29f)
                curveTo(18.89f, 7.5f, 19f, 7.73f, 19f, 8f)
                verticalLineTo(10.78f)
                curveTo(19f, 10.97f, 18.97f, 11.11f, 18.94f, 11.2f)
                lineTo(18.14f, 15.19f)
                curveTo(18f, 15.72f, 17.7f, 16f, 17.2f, 16f)
                horizontalLineTo(6.8f)
                curveTo(6.27f, 16f, 5.95f, 15.72f, 5.86f, 15.19f)
                lineTo(5.06f, 11.2f)
                curveTo(5.03f, 11.11f, 5f, 10.97f, 5f, 10.78f)
                verticalLineTo(5f)
                curveTo(5f, 4.5f, 5.21f, 4f, 5.6f, 3.61f)
                curveTo(6f, 3.2f, 6.45f, 3f, 7f, 3f)
                horizontalLineTo(15f)
                curveTo(15.53f, 3f, 16f, 3.2f, 16.41f, 3.61f)
                curveTo(16.81f, 4f, 17f, 4.5f, 17f, 5f)
                verticalLineTo(8f)
                curveTo(17f, 7.73f, 17.11f, 7.5f, 17.3f, 7.29f)
                curveTo(17.5f, 7.09f, 17.72f, 7f, 18f, 7f)
                moveTo(7f, 20f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                verticalLineTo(20f)
                curveTo(17f, 20.3f, 16.91f, 20.53f, 16.71f, 20.72f)
                curveTo(16.5f, 20.91f, 16.27f, 21f, 16f, 21f)
                horizontalLineTo(8f)
                curveTo(7.73f, 21f, 7.5f, 20.91f, 7.29f, 20.72f)
                curveTo(7.09f, 20.53f, 7f, 20.3f, 7f, 20f)
                close()
            }
        }.build()

        return _MixedMartialArts!!
    }

@Suppress("ObjectPropertyName")
private var _MixedMartialArts: ImageVector? = null
