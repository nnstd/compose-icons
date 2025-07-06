package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AllInclusiveBoxOutline: ImageVector
    get() {
        if (_AllInclusiveBoxOutline != null) {
            return _AllInclusiveBoxOutline!!
        }
        _AllInclusiveBoxOutline = ImageVector.Builder(
            name = "AllInclusiveBoxOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 12f)
                curveTo(19f, 13.84f, 17.5f, 15.34f, 15.66f, 15.34f)
                curveTo(14.77f, 15.34f, 13.94f, 15f, 13.31f, 14.36f)
                lineTo(12.71f, 13.76f)
                lineTo(13.77f, 12.71f)
                curveTo(14.04f, 13f, 14.37f, 13.3f, 14.37f, 13.3f)
                curveTo(14.71f, 13.65f, 15.18f, 13.84f, 15.67f, 13.84f)
                curveTo(16.68f, 13.84f, 17.5f, 13f, 17.5f, 12f)
                reflectiveCurveTo(16.68f, 10.16f, 15.67f, 10.16f)
                curveTo(15.18f, 10.16f, 14.71f, 10.36f, 14.37f, 10.7f)
                lineTo(10.7f, 14.36f)
                curveTo(10.07f, 15f, 9.23f, 15.34f, 8.34f, 15.34f)
                curveTo(6.5f, 15.34f, 5f, 13.84f, 5f, 12f)
                reflectiveCurveTo(6.5f, 8.66f, 8.34f, 8.66f)
                curveTo(9.23f, 8.66f, 10.07f, 9f, 10.7f, 9.64f)
                lineTo(11.29f, 10.24f)
                lineTo(10.23f, 11.3f)
                lineTo(9.64f, 10.7f)
                curveTo(9.29f, 10.36f, 8.83f, 10.16f, 8.34f, 10.16f)
                curveTo(7.32f, 10.16f, 6.5f, 11f, 6.5f, 12f)
                reflectiveCurveTo(7.32f, 13.84f, 8.34f, 13.84f)
                curveTo(8.83f, 13.84f, 9.29f, 13.65f, 9.64f, 13.3f)
                lineTo(13.31f, 9.64f)
                curveTo(13.94f, 9f, 14.77f, 8.66f, 15.66f, 8.66f)
                curveTo(17.5f, 8.66f, 19f, 10.16f, 19f, 12f)
                moveTo(21f, 5f)
                verticalLineTo(19f)
                curveTo(21f, 20.11f, 20.11f, 21f, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(3.9f, 21f, 3f, 20.11f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.89f, 3.89f, 3f, 5f, 3f)
                horizontalLineTo(19f)
                curveTo(20.1f, 3f, 21f, 3.89f, 21f, 5f)
                moveTo(19f, 5f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _AllInclusiveBoxOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AllInclusiveBoxOutline: ImageVector? = null
