package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Cylinder: ImageVector
    get() {
        if (_Cylinder != null) {
            return _Cylinder!!
        }
        _Cylinder = ImageVector.Builder(
            name = "Cylinder",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(9.89f, 2f, 3f, 2.29f, 3f, 6f)
                verticalLineTo(18f)
                curveTo(3f, 21.71f, 9.89f, 22f, 12f, 22f)
                curveTo(14.11f, 22f, 21f, 21.71f, 21f, 18f)
                verticalLineTo(6f)
                curveTo(21f, 2.29f, 14.11f, 2f, 12f, 2f)
                moveTo(12f, 10f)
                curveTo(13.38f, 10f, 16.8f, 9.87f, 19f, 8.75f)
                verticalLineTo(15.25f)
                curveTo(16.8f, 14.13f, 13.38f, 14f, 12f, 14f)
                reflectiveCurveTo(7.2f, 14.13f, 5f, 15.25f)
                verticalLineTo(8.75f)
                curveTo(7.2f, 9.87f, 10.62f, 10f, 12f, 10f)
                moveTo(12f, 4f)
                curveTo(15.87f, 4f, 19f, 4.89f, 19f, 6f)
                curveTo(19f, 7.11f, 15.87f, 8f, 12f, 8f)
                curveTo(8.13f, 8f, 5f, 7.11f, 5f, 6f)
                curveTo(5f, 4.89f, 8.13f, 4f, 12f, 4f)
                moveTo(12f, 20f)
                curveTo(8.13f, 20f, 5f, 19.11f, 5f, 18f)
                curveTo(5f, 16.9f, 8.13f, 16f, 12f, 16f)
                curveTo(15.87f, 16f, 19f, 16.9f, 19f, 18f)
                curveTo(19f, 19.11f, 15.87f, 20f, 12f, 20f)
                close()
            }
        }.build()

        return _Cylinder!!
    }

@Suppress("ObjectPropertyName")
private var _Cylinder: ImageVector? = null
