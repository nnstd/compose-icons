package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BottleWineOutline: ImageVector
    get() {
        if (_BottleWineOutline != null) {
            return _BottleWineOutline!!
        }
        _BottleWineOutline = ImageVector.Builder(
            name = "BottleWineOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.5f, 2f)
                curveTo(11.22f, 2f, 11f, 2.22f, 11f, 2.5f)
                verticalLineTo(7f)
                curveTo(10.93f, 7f, 10.85f, 7f, 10.78f, 7.03f)
                curveTo(9.82f, 7.27f, 9.21f, 8f, 8.76f, 8.89f)
                curveTo(8.3f, 9.76f, 8f, 10.84f, 8f, 12f)
                curveTo(8.05f, 15f, 8f, 18.03f, 8f, 21f)
                curveTo(8f, 21.55f, 8.45f, 22f, 9f, 22f)
                curveTo(11f, 22f, 13f, 22f, 15f, 22f)
                curveTo(15.55f, 22f, 16f, 21.55f, 16f, 21f)
                curveTo(16.04f, 18f, 16f, 15f, 16f, 12f)
                curveTo(16f, 10.84f, 15.74f, 9.76f, 15.28f, 8.88f)
                curveTo(14.83f, 8f, 14.22f, 7.27f, 13.26f, 7.04f)
                curveTo(13.18f, 7f, 13.05f, 7f, 13f, 7f)
                verticalLineTo(2.5f)
                curveTo(13f, 2.22f, 12.78f, 2f, 12.5f, 2f)
                moveTo(12f, 8.85f)
                curveTo(12.32f, 8.85f, 12.63f, 8.9f, 12.78f, 9f)
                curveTo(12.85f, 9.03f, 13.2f, 9.26f, 13.5f, 9.81f)
                curveTo(13.78f, 10.37f, 14f, 11.17f, 14f, 12f)
                verticalLineTo(20f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                curveTo(10f, 11.17f, 10.22f, 10.37f, 10.5f, 9.81f)
                curveTo(10.8f, 9.26f, 11.15f, 9.03f, 11.22f, 9f)
                curveTo(11.36f, 8.9f, 11.68f, 8.85f, 12f, 8.85f)
                close()
            }
        }.build()

        return _BottleWineOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BottleWineOutline: ImageVector? = null
