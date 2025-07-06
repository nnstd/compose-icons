package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SeedPlusOutline: ImageVector
    get() {
        if (_SeedPlusOutline != null) {
            return _SeedPlusOutline!!
        }
        _SeedPlusOutline = ImageVector.Builder(
            name = "SeedPlusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.2f, 5f)
                curveTo(17.8f, 5f, 18.4f, 5f, 18.9f, 5.1f)
                curveTo(19.04f, 6.7f, 19.08f, 9.42f, 18.18f, 12f)
                curveTo(18.89f, 12f, 19.56f, 12.17f, 20.18f, 12.41f)
                curveTo(21.64f, 7.9f, 20.7f, 3.3f, 20.7f, 3.3f)
                reflectiveCurveTo(19.3f, 3f, 17.2f, 3f)
                curveTo(11.7f, 3f, 1.6f, 5.1f, 3.2f, 20.8f)
                curveTo(4.3f, 20.9f, 5.4f, 21f, 6.4f, 21f)
                curveTo(8.75f, 21f, 10.74f, 20.69f, 12.4f, 20.16f)
                curveTo(12.16f, 19.54f, 12f, 18.87f, 12f, 18.17f)
                curveTo(10.41f, 18.72f, 8.53f, 19f, 6.4f, 19f)
                horizontalLineTo(5.1f)
                curveTo(4.9f, 14.4f, 5.8f, 10.8f, 7.9f, 8.5f)
                curveTo(10.4f, 5.6f, 14.4f, 5f, 17.2f, 5f)
                moveTo(17f, 7f)
                curveTo(7f, 7f, 7f, 17f, 7f, 17f)
                curveTo(11f, 9f, 17f, 7f, 17f, 7f)
                moveTo(17f, 17f)
                horizontalLineTo(14f)
                verticalLineTo(19f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                verticalLineTo(14f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _SeedPlusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SeedPlusOutline: ImageVector? = null
