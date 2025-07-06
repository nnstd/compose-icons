package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GarageVariantLock: ImageVector
    get() {
        if (_GarageVariantLock != null) {
            return _GarageVariantLock!!
        }
        _GarageVariantLock = ImageVector.Builder(
            name = "GarageVariantLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.8f, 16f)
                verticalLineTo(14.5f)
                curveTo(21.8f, 13.1f, 20.4f, 12f, 19f, 12f)
                reflectiveCurveTo(16.2f, 13.1f, 16.2f, 14.5f)
                verticalLineTo(16f)
                curveTo(15.6f, 16f, 15f, 16.6f, 15f, 17.2f)
                verticalLineTo(20.7f)
                curveTo(15f, 21.4f, 15.6f, 22f, 16.2f, 22f)
                horizontalLineTo(21.7f)
                curveTo(22.4f, 22f, 23f, 21.4f, 23f, 20.8f)
                verticalLineTo(17.3f)
                curveTo(23f, 16.6f, 22.4f, 16f, 21.8f, 16f)
                moveTo(20.5f, 16f)
                horizontalLineTo(17.5f)
                verticalLineTo(14.5f)
                curveTo(17.5f, 13.7f, 18.2f, 13.2f, 19f, 13.2f)
                reflectiveCurveTo(20.5f, 13.7f, 20.5f, 14.5f)
                verticalLineTo(16f)
                moveTo(5f, 12f)
                horizontalLineTo(15.04f)
                curveTo(14.61f, 12.59f, 14.35f, 13.27f, 14.26f, 14f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                moveTo(16.06f, 11f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                horizontalLineTo(2f)
                verticalLineTo(9f)
                lineTo(12f, 5f)
                lineTo(22f, 9f)
                verticalLineTo(11.04f)
                curveTo(21.17f, 10.4f, 20.13f, 10f, 19f, 10f)
                curveTo(17.9f, 10f, 16.88f, 10.39f, 16.06f, 11f)
                moveTo(13f, 20f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                moveTo(5f, 15f)
                horizontalLineTo(13.95f)
                curveTo(13.42f, 15.54f, 13.08f, 16.24f, 13f, 17f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _GarageVariantLock!!
    }

@Suppress("ObjectPropertyName")
private var _GarageVariantLock: ImageVector? = null
