package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SortVariantLockOpen: ImageVector
    get() {
        if (_SortVariantLockOpen != null) {
            return _SortVariantLockOpen!!
        }
        _SortVariantLockOpen = ImageVector.Builder(
            name = "SortVariantLockOpen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 17.3f)
                verticalLineTo(20.8f)
                curveTo(23f, 21.4f, 22.4f, 22f, 21.7f, 22f)
                horizontalLineTo(16.2f)
                curveTo(15.6f, 22f, 15f, 21.4f, 15f, 20.7f)
                verticalLineTo(17.2f)
                curveTo(15f, 16.6f, 15.6f, 16f, 16.2f, 16f)
                verticalLineTo(13.5f)
                curveTo(16.2f, 12.1f, 17.6f, 11f, 19f, 11f)
                reflectiveCurveTo(21.8f, 12.1f, 21.8f, 13.5f)
                verticalLineTo(14f)
                horizontalLineTo(20.5f)
                verticalLineTo(13.5f)
                curveTo(20.5f, 12.7f, 19.8f, 12.2f, 19f, 12.2f)
                reflectiveCurveTo(17.5f, 12.7f, 17.5f, 13.5f)
                verticalLineTo(16f)
                horizontalLineTo(21.8f)
                curveTo(22.4f, 16f, 23f, 16.6f, 23f, 17.3f)
                moveTo(3f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                moveTo(3f, 6f)
                horizontalLineTo(21f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                moveTo(3f, 18f)
                verticalLineTo(16f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(3f)
            }
        }.build()

        return _SortVariantLockOpen!!
    }

@Suppress("ObjectPropertyName")
private var _SortVariantLockOpen: ImageVector? = null
