package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeadDotsHorizontalOutline: ImageVector
    get() {
        if (_HeadDotsHorizontalOutline != null) {
            return _HeadDotsHorizontalOutline!!
        }
        _HeadDotsHorizontalOutline = ImageVector.Builder(
            name = "HeadDotsHorizontalOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 3f)
                curveTo(16.9f, 3f, 20f, 6.1f, 20f, 10f)
                curveTo(20f, 12.8f, 18.4f, 15.2f, 16f, 16.3f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(8f)
                curveTo(6.9f, 18f, 6f, 17.1f, 6f, 16f)
                verticalLineTo(13f)
                horizontalLineTo(4.5f)
                curveTo(4.1f, 13f, 3.8f, 12.5f, 4.1f, 12.2f)
                lineTo(6f, 9.7f)
                curveTo(6.2f, 5.9f, 9.2f, 3f, 13f, 3f)
                moveTo(13f, 1f)
                curveTo(8.4f, 1f, 4.6f, 4.4f, 4.1f, 8.9f)
                lineTo(2.5f, 11f)
                curveTo(1.9f, 11.8f, 1.9f, 12.8f, 2.3f, 13.6f)
                curveTo(2.7f, 14.3f, 3.3f, 14.8f, 4f, 14.9f)
                verticalLineTo(16f)
                curveTo(4f, 17.9f, 5.3f, 19.4f, 7f, 19.9f)
                verticalLineTo(23f)
                horizontalLineTo(18f)
                verticalLineTo(17.5f)
                curveTo(20.5f, 15.8f, 22f, 13.1f, 22f, 10f)
                curveTo(22f, 5f, 18f, 1f, 13f, 1f)
                moveTo(10f, 10f)
                curveTo(9.4f, 10f, 9f, 9.6f, 9f, 9f)
                reflectiveCurveTo(9.4f, 8f, 10f, 8f)
                reflectiveCurveTo(11f, 8.4f, 11f, 9f)
                reflectiveCurveTo(10.6f, 10f, 10f, 10f)
                moveTo(13f, 10f)
                curveTo(12.4f, 10f, 12f, 9.6f, 12f, 9f)
                reflectiveCurveTo(12.4f, 8f, 13f, 8f)
                reflectiveCurveTo(14f, 8.4f, 14f, 9f)
                reflectiveCurveTo(13.6f, 10f, 13f, 10f)
                moveTo(16f, 10f)
                curveTo(15.5f, 10f, 15f, 9.6f, 15f, 9f)
                reflectiveCurveTo(15.5f, 8f, 16f, 8f)
                reflectiveCurveTo(17f, 8.4f, 17f, 9f)
                reflectiveCurveTo(16.5f, 10f, 16f, 10f)
                close()
            }
        }.build()

        return _HeadDotsHorizontalOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HeadDotsHorizontalOutline: ImageVector? = null
