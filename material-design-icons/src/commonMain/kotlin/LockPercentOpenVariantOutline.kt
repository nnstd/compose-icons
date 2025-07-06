package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LockPercentOpenVariantOutline: ImageVector
    get() {
        if (_LockPercentOpenVariantOutline != null) {
            return _LockPercentOpenVariantOutline!!
        }
        _LockPercentOpenVariantOutline = ImageVector.Builder(
            name = "LockPercentOpenVariantOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.5f, 11f)
                curveTo(8.3f, 11f, 9f, 11.7f, 9f, 12.5f)
                reflectiveCurveTo(8.3f, 14f, 7.5f, 14f)
                reflectiveCurveTo(6f, 13.3f, 6f, 12.5f)
                reflectiveCurveTo(6.7f, 11f, 7.5f, 11f)
                moveTo(12.5f, 19f)
                curveTo(11.7f, 19f, 11f, 18.3f, 11f, 17.5f)
                reflectiveCurveTo(11.7f, 16f, 12.5f, 16f)
                reflectiveCurveTo(14f, 16.7f, 14f, 17.5f)
                reflectiveCurveTo(13.3f, 19f, 12.5f, 19f)
                moveTo(7.2f, 19.2f)
                lineTo(5.8f, 17.8f)
                lineTo(12.9f, 10.7f)
                lineTo(14.3f, 12.1f)
                lineTo(7.2f, 19.2f)
                moveTo(18f, 1f)
                curveTo(15.2f, 1f, 13f, 3.2f, 13f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(4f)
                curveTo(2.9f, 8f, 2f, 8.9f, 2f, 10f)
                verticalLineTo(20f)
                curveTo(2f, 21.1f, 2.9f, 22f, 4f, 22f)
                horizontalLineTo(16f)
                curveTo(17.1f, 22f, 18f, 21.1f, 18f, 20f)
                verticalLineTo(10f)
                curveTo(18f, 8.9f, 17.1f, 8f, 16f, 8f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                curveTo(15f, 4.3f, 16.3f, 3f, 18f, 3f)
                reflectiveCurveTo(21f, 4.3f, 21f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(23f)
                verticalLineTo(6f)
                curveTo(23f, 3.2f, 20.8f, 1f, 18f, 1f)
                moveTo(16f, 10f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(10f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _LockPercentOpenVariantOutline!!
    }

@Suppress("ObjectPropertyName")
private var _LockPercentOpenVariantOutline: ImageVector? = null
