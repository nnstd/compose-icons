package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LeafCircleOutline: ImageVector
    get() {
        if (_LeafCircleOutline != null) {
            return _LeafCircleOutline!!
        }
        _LeafCircleOutline = ImageVector.Builder(
            name = "LeafCircleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.04f, 16.34f)
                curveTo(9.05f, 13.83f, 10.19f, 10.96f, 14.5f, 10f)
                curveTo(14.5f, 10f, 9.5f, 10f, 7.88f, 14.63f)
                curveTo(7.88f, 14.63f, 7f, 13.75f, 7f, 12.75f)
                reflectiveCurveTo(8f, 9.63f, 10.5f, 9.13f)
                curveTo(11.21f, 9f, 12f, 8.87f, 12.78f, 8.76f)
                curveTo(14.75f, 8.5f, 16.64f, 8.22f, 17f, 7.5f)
                curveTo(17f, 7.5f, 15.5f, 16f, 10f, 16f)
                curveTo(9.82f, 16f, 9.57f, 15.94f, 9.33f, 15.85f)
                lineTo(8.86f, 17f)
                lineTo(7.91f, 16.67f)
                lineTo(8.04f, 16.34f)
                moveTo(12f, 4f)
                curveTo(16.41f, 4f, 20f, 7.59f, 20f, 12f)
                reflectiveCurveTo(16.41f, 20f, 12f, 20f)
                reflectiveCurveTo(4f, 16.41f, 4f, 12f)
                reflectiveCurveTo(7.59f, 4f, 12f, 4f)
                moveTo(12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                reflectiveCurveTo(6.5f, 22f, 12f, 22f)
                reflectiveCurveTo(22f, 17.5f, 22f, 12f)
                reflectiveCurveTo(17.5f, 2f, 12f, 2f)
                close()
            }
        }.build()

        return _LeafCircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _LeafCircleOutline: ImageVector? = null
