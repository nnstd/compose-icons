package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeHeart: ImageVector
    get() {
        if (_HomeHeart != null) {
            return _HomeHeart!!
        }
        _HomeHeart = ImageVector.Builder(
            name = "HomeHeart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 12f)
                lineTo(12f, 3f)
                lineTo(22f, 12f)
                horizontalLineTo(19f)
                verticalLineTo(20f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                horizontalLineTo(2f)
                moveTo(12f, 18f)
                lineTo(12.72f, 17.34f)
                curveTo(15.3f, 15f, 17f, 13.46f, 17f, 11.57f)
                curveTo(17f, 10.03f, 15.79f, 8.82f, 14.25f, 8.82f)
                curveTo(13.38f, 8.82f, 12.55f, 9.23f, 12f, 9.87f)
                curveTo(11.45f, 9.23f, 10.62f, 8.82f, 9.75f, 8.82f)
                curveTo(8.21f, 8.82f, 7f, 10.03f, 7f, 11.57f)
                curveTo(7f, 13.46f, 8.7f, 15f, 11.28f, 17.34f)
                lineTo(12f, 18f)
                close()
            }
        }.build()

        return _HomeHeart!!
    }

@Suppress("ObjectPropertyName")
private var _HomeHeart: ImageVector? = null
