package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LockOpenVariantOutline: ImageVector
    get() {
        if (_LockOpenVariantOutline != null) {
            return _LockOpenVariantOutline!!
        }
        _LockOpenVariantOutline = ImageVector.Builder(
            name = "LockOpenVariantOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 13f)
                curveTo(11.1f, 13f, 12f, 13.89f, 12f, 15f)
                curveTo(12f, 16.11f, 11.11f, 17f, 10f, 17f)
                reflectiveCurveTo(8f, 16.11f, 8f, 15f)
                reflectiveCurveTo(8.9f, 13f, 10f, 13f)
                moveTo(18f, 1f)
                curveTo(15.24f, 1f, 13f, 3.24f, 13f, 6f)
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
                curveTo(15f, 4.34f, 16.34f, 3f, 18f, 3f)
                reflectiveCurveTo(21f, 4.34f, 21f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(23f)
                verticalLineTo(6f)
                curveTo(23f, 3.24f, 20.76f, 1f, 18f, 1f)
                moveTo(16f, 10f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(10f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _LockOpenVariantOutline!!
    }

@Suppress("ObjectPropertyName")
private var _LockOpenVariantOutline: ImageVector? = null
