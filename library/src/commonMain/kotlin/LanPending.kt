package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LanPending: ImageVector
    get() {
        if (_LanPending != null) {
            return _LanPending!!
        }
        _LanPending = ImageVector.Builder(
            name = "LanPending",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 1f)
                curveTo(2.89f, 1f, 2f, 1.89f, 2f, 3f)
                verticalLineTo(7f)
                curveTo(2f, 8.11f, 2.89f, 9f, 4f, 9f)
                horizontalLineTo(1f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(10f)
                curveTo(11.11f, 9f, 12f, 8.11f, 12f, 7f)
                verticalLineTo(3f)
                curveTo(12f, 1.89f, 11.11f, 1f, 10f, 1f)
                horizontalLineTo(4f)
                moveTo(4f, 3f)
                horizontalLineTo(10f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                verticalLineTo(3f)
                moveTo(3f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                horizontalLineTo(3f)
                moveTo(14f, 13f)
                curveTo(12.89f, 13f, 12f, 13.89f, 12f, 15f)
                verticalLineTo(19f)
                curveTo(12f, 20.11f, 12.89f, 21f, 14f, 21f)
                horizontalLineTo(11f)
                verticalLineTo(23f)
                horizontalLineTo(23f)
                verticalLineTo(21f)
                horizontalLineTo(20f)
                curveTo(21.11f, 21f, 22f, 20.11f, 22f, 19f)
                verticalLineTo(15f)
                curveTo(22f, 13.89f, 21.11f, 13f, 20f, 13f)
                horizontalLineTo(14f)
                moveTo(3f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                moveTo(14f, 15f)
                horizontalLineTo(20f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                moveTo(3f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                horizontalLineTo(3f)
                moveTo(6f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(8f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                moveTo(9f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _LanPending!!
    }

@Suppress("ObjectPropertyName")
private var _LanPending: ImageVector? = null
