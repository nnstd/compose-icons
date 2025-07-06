package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountCash: ImageVector
    get() {
        if (_AccountCash != null) {
            return _AccountCash!!
        }
        _AccountCash = ImageVector.Builder(
            name = "AccountCash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 8f)
                curveTo(11f, 10.21f, 9.21f, 12f, 7f, 12f)
                curveTo(4.79f, 12f, 3f, 10.21f, 3f, 8f)
                curveTo(3f, 5.79f, 4.79f, 4f, 7f, 4f)
                curveTo(9.21f, 4f, 11f, 5.79f, 11f, 8f)
                moveTo(11f, 14.72f)
                verticalLineTo(20f)
                horizontalLineTo(0f)
                verticalLineTo(18f)
                curveTo(0f, 15.79f, 3.13f, 14f, 7f, 14f)
                curveTo(8.5f, 14f, 9.87f, 14.27f, 11f, 14.72f)
                moveTo(24f, 20f)
                horizontalLineTo(13f)
                verticalLineTo(3f)
                horizontalLineTo(24f)
                verticalLineTo(20f)
                moveTo(16f, 11.5f)
                curveTo(16f, 10.12f, 17.12f, 9f, 18.5f, 9f)
                curveTo(19.88f, 9f, 21f, 10.12f, 21f, 11.5f)
                curveTo(21f, 12.88f, 19.88f, 14f, 18.5f, 14f)
                curveTo(17.12f, 14f, 16f, 12.88f, 16f, 11.5f)
                moveTo(22f, 7f)
                curveTo(20.9f, 7f, 20f, 6.11f, 20f, 5f)
                horizontalLineTo(17f)
                curveTo(17f, 6.11f, 16.11f, 7f, 15f, 7f)
                verticalLineTo(16f)
                curveTo(16.11f, 16f, 17f, 16.9f, 17f, 18f)
                horizontalLineTo(20f)
                curveTo(20f, 16.9f, 20.9f, 16f, 22f, 16f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _AccountCash!!
    }

@Suppress("ObjectPropertyName")
private var _AccountCash: ImageVector? = null
