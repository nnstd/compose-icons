package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AllInclusiveBox: ImageVector
    get() {
        if (_AllInclusiveBox != null) {
            return _AllInclusiveBox!!
        }
        _AllInclusiveBox = ImageVector.Builder(
            name = "AllInclusiveBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.89f, 3f, 3f, 3.89f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.11f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.11f, 21f, 21f, 20.11f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.89f, 20.1f, 3f, 19f, 3f)
                moveTo(16.1f, 15.9f)
                curveTo(15.07f, 15.9f, 14.09f, 15.5f, 13.35f, 14.76f)
                lineTo(12.71f, 14.12f)
                lineTo(14.13f, 12.71f)
                lineTo(14.76f, 13.34f)
                curveTo(15.12f, 13.7f, 15.6f, 13.9f, 16.11f, 13.9f)
                curveTo(17.15f, 13.9f, 18f, 13.05f, 18f, 12f)
                reflectiveCurveTo(17.15f, 10.1f, 16.1f, 10.1f)
                curveTo(15.6f, 10.1f, 15.12f, 10.3f, 14.76f, 10.66f)
                lineTo(10.65f, 14.76f)
                curveTo(9.91f, 15.5f, 8.94f, 15.9f, 7.9f, 15.9f)
                curveTo(5.75f, 15.9f, 4f, 14.15f, 4f, 12f)
                reflectiveCurveTo(5.75f, 8.1f, 7.9f, 8.1f)
                curveTo(8.94f, 8.1f, 9.91f, 8.5f, 10.65f, 9.24f)
                lineTo(11.29f, 9.88f)
                lineTo(9.87f, 11.3f)
                lineTo(9.24f, 10.66f)
                curveTo(8.88f, 10.3f, 8.4f, 10.1f, 7.9f, 10.1f)
                curveTo(6.85f, 10.1f, 6f, 10.95f, 6f, 12f)
                reflectiveCurveTo(6.85f, 13.9f, 7.9f, 13.9f)
                curveTo(8.4f, 13.9f, 8.88f, 13.7f, 9.24f, 13.34f)
                lineTo(13.35f, 9.24f)
                curveTo(14.09f, 8.5f, 15.06f, 8.1f, 16.1f, 8.1f)
                curveTo(18.25f, 8.1f, 20f, 9.85f, 20f, 12f)
                reflectiveCurveTo(18.25f, 15.9f, 16.1f, 15.9f)
                close()
            }
        }.build()

        return _AllInclusiveBox!!
    }

@Suppress("ObjectPropertyName")
private var _AllInclusiveBox: ImageVector? = null
