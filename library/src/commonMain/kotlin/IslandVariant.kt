package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.IslandVariant: ImageVector
    get() {
        if (_IslandVariant != null) {
            return _IslandVariant!!
        }
        _IslandVariant = ImageVector.Builder(
            name = "IslandVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 15.26f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                lineTo(15f, 9f)
                horizontalLineTo(12f)
                lineTo(15f, 6f)
                horizontalLineTo(13f)
                lineTo(16f, 3f)
                lineTo(19f, 6f)
                horizontalLineTo(17f)
                lineTo(20f, 9f)
                horizontalLineTo(17f)
                lineTo(21f, 13f)
                horizontalLineTo(17f)
                verticalLineTo(15.76f)
                curveTo(19.13f, 16.47f, 20.68f, 17.67f, 21f, 19f)
                curveTo(19.3f, 18.87f, 17.62f, 18.54f, 16f, 18f)
                curveTo(14.79f, 18.61f, 13.37f, 19f, 12f, 19f)
                curveTo(10.71f, 19f, 9.17f, 18.58f, 8f, 18f)
                curveTo(6.37f, 18.54f, 4.72f, 18.87f, 3f, 19f)
                curveTo(3.54f, 16.77f, 7.4f, 15f, 12f, 15f)
                curveTo(13.05f, 15f, 14.06f, 15.09f, 15f, 15.26f)
                moveTo(8f, 19f)
                curveTo(8f, 19f, 5f, 20f, 2f, 20f)
                verticalLineTo(22f)
                curveTo(5f, 22f, 8f, 21f, 8f, 21f)
                curveTo(8f, 21f, 10f, 22f, 12f, 22f)
                curveTo(14f, 22f, 16f, 21f, 16f, 21f)
                curveTo(16f, 21f, 19f, 22f, 22f, 22f)
                verticalLineTo(20f)
                curveTo(19f, 20f, 16f, 19f, 16f, 19f)
                curveTo(16f, 19f, 14f, 20f, 12f, 20f)
                curveTo(10f, 20f, 8f, 19f, 8f, 19f)
                close()
            }
        }.build()

        return _IslandVariant!!
    }

@Suppress("ObjectPropertyName")
private var _IslandVariant: ImageVector? = null
