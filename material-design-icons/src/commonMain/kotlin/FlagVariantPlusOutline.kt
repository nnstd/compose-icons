package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlagVariantPlusOutline: ImageVector
    get() {
        if (_FlagVariantPlusOutline != null) {
            return _FlagVariantPlusOutline!!
        }
        _FlagVariantPlusOutline = ImageVector.Builder(
            name = "FlagVariantPlusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 3f)
                curveTo(6.6f, 3f, 7f, 3.4f, 7f, 4f)
                verticalLineTo(4.9f)
                curveTo(8.1f, 4.4f, 9.5f, 4f, 11f, 4f)
                curveTo(14f, 4f, 14f, 6f, 16f, 6f)
                curveTo(19f, 6f, 20f, 4f, 20f, 4f)
                verticalLineTo(12f)
                curveTo(20f, 12f, 19f, 14f, 16f, 14f)
                reflectiveCurveTo(13f, 12f, 11f, 12f)
                curveTo(8f, 12f, 7f, 14f, 7f, 14f)
                verticalLineTo(21f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                curveTo(5f, 3.4f, 5.4f, 3f, 6f, 3f)
                moveTo(7f, 7.2f)
                verticalLineTo(11.4f)
                curveTo(7f, 11.4f, 9f, 9.9f, 11f, 9.9f)
                reflectiveCurveTo(14f, 11.9f, 16f, 11.9f)
                reflectiveCurveTo(18f, 10.9f, 18f, 10.9f)
                verticalLineTo(7.5f)
                curveTo(18f, 7.5f, 17f, 8f, 16f, 8f)
                curveTo(14f, 8f, 13f, 6f, 11f, 6f)
                reflectiveCurveTo(7f, 7.2f, 7f, 7.2f)
                moveTo(18f, 15f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(23f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                horizontalLineTo(23f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _FlagVariantPlusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FlagVariantPlusOutline: ImageVector? = null
