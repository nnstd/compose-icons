package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LightbulbVariantOutline: ImageVector
    get() {
        if (_LightbulbVariantOutline != null) {
            return _LightbulbVariantOutline!!
        }
        _LightbulbVariantOutline = ImageVector.Builder(
            name = "LightbulbVariantOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(8.13f, 2f, 5f, 5.13f, 5f, 9f)
                curveTo(5f, 11.38f, 6.19f, 13.47f, 8f, 14.74f)
                verticalLineTo(17f)
                curveTo(8f, 17.55f, 8.45f, 18f, 9f, 18f)
                horizontalLineTo(15f)
                curveTo(15.55f, 18f, 16f, 17.55f, 16f, 17f)
                verticalLineTo(14.74f)
                curveTo(17.81f, 13.47f, 19f, 11.38f, 19f, 9f)
                curveTo(19f, 5.13f, 15.87f, 2f, 12f, 2f)
                moveTo(14f, 13.58f)
                verticalLineTo(16f)
                horizontalLineTo(13f)
                verticalLineTo(11.41f)
                lineTo(14.71f, 9.71f)
                curveTo(15.1f, 9.32f, 15.1f, 8.68f, 14.71f, 8.29f)
                curveTo(14.32f, 7.9f, 13.68f, 7.9f, 13.29f, 8.29f)
                lineTo(12f, 9.59f)
                lineTo(10.71f, 8.29f)
                curveTo(10.32f, 7.9f, 9.68f, 7.9f, 9.29f, 8.29f)
                curveTo(8.9f, 8.68f, 8.9f, 9.32f, 9.29f, 9.71f)
                lineTo(11f, 11.41f)
                verticalLineTo(16f)
                horizontalLineTo(10f)
                verticalLineTo(13.58f)
                curveTo(8.23f, 12.81f, 7f, 11.05f, 7f, 9f)
                curveTo(7f, 6.24f, 9.24f, 4f, 12f, 4f)
                reflectiveCurveTo(17f, 6.24f, 17f, 9f)
                curveTo(17f, 11.05f, 15.77f, 12.81f, 14f, 13.58f)
                moveTo(9f, 20f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                curveTo(15f, 21.55f, 14.55f, 22f, 14f, 22f)
                horizontalLineTo(10f)
                curveTo(9.45f, 22f, 9f, 21.55f, 9f, 21f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _LightbulbVariantOutline!!
    }

@Suppress("ObjectPropertyName")
private var _LightbulbVariantOutline: ImageVector? = null
