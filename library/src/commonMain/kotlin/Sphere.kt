package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Sphere: ImageVector
    get() {
        if (_Sphere != null) {
            return _Sphere!!
        }
        _Sphere = ImageVector.Builder(
            name = "Sphere",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                curveTo(2f, 17.5f, 6.5f, 22f, 12f, 22f)
                curveTo(17.5f, 22f, 22f, 17.5f, 22f, 12f)
                curveTo(22f, 6.5f, 17.5f, 2f, 12f, 2f)
                moveTo(12f, 14f)
                curveTo(7.58f, 14f, 4f, 13.11f, 4f, 12f)
                curveTo(4f, 10.9f, 7.58f, 10f, 12f, 10f)
                reflectiveCurveTo(20f, 10.9f, 20f, 12f)
                curveTo(20f, 13.11f, 16.42f, 14f, 12f, 14f)
                moveTo(12f, 4f)
                curveTo(15.37f, 4f, 18.25f, 6.09f, 19.43f, 9.05f)
                curveTo(17.93f, 8.43f, 15.61f, 8f, 12f, 8f)
                curveTo(9.8f, 8f, 6.73f, 8.19f, 4.57f, 9.05f)
                curveTo(5.75f, 6.09f, 8.63f, 4f, 12f, 4f)
                moveTo(12f, 20f)
                curveTo(8.63f, 20f, 5.75f, 17.91f, 4.57f, 14.95f)
                curveTo(6.07f, 15.57f, 8.39f, 16f, 12f, 16f)
                curveTo(14.2f, 16f, 17.27f, 15.81f, 19.43f, 14.95f)
                curveTo(18.25f, 17.91f, 15.37f, 20f, 12f, 20f)
                close()
            }
        }.build()

        return _Sphere!!
    }

@Suppress("ObjectPropertyName")
private var _Sphere: ImageVector? = null
