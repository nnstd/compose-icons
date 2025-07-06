package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Ammunition: ImageVector
    get() {
        if (_Ammunition != null) {
            return _Ammunition!!
        }
        _Ammunition = ImageVector.Builder(
            name = "Ammunition",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 22f)
                horizontalLineTo(10f)
                verticalLineTo(21f)
                horizontalLineTo(14f)
                verticalLineTo(22f)
                moveTo(13f, 10f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                lineTo(10f, 11.5f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                verticalLineTo(11.5f)
                lineTo(13f, 10f)
                moveTo(12f, 2f)
                curveTo(12f, 2f, 11f, 3f, 11f, 5f)
                verticalLineTo(6f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                curveTo(13f, 5f, 13f, 3f, 12f, 2f)
                moveTo(8f, 22f)
                horizontalLineTo(4f)
                verticalLineTo(21f)
                horizontalLineTo(8f)
                verticalLineTo(22f)
                moveTo(7f, 10f)
                verticalLineTo(7f)
                horizontalLineTo(5f)
                verticalLineTo(10f)
                lineTo(4f, 11.5f)
                verticalLineTo(20f)
                horizontalLineTo(8f)
                verticalLineTo(11.5f)
                lineTo(7f, 10f)
                moveTo(6f, 2f)
                curveTo(6f, 2f, 5f, 3f, 5f, 5f)
                verticalLineTo(6f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                curveTo(7f, 5f, 7f, 3f, 6f, 2f)
                moveTo(20f, 22f)
                horizontalLineTo(16f)
                verticalLineTo(21f)
                horizontalLineTo(20f)
                verticalLineTo(22f)
                moveTo(19f, 10f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                verticalLineTo(10f)
                lineTo(16f, 11.5f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(11.5f)
                lineTo(19f, 10f)
                moveTo(18f, 2f)
                curveTo(18f, 2f, 17f, 3f, 17f, 5f)
                verticalLineTo(6f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                curveTo(19f, 5f, 19f, 3f, 18f, 2f)
                close()
            }
        }.build()

        return _Ammunition!!
    }

@Suppress("ObjectPropertyName")
private var _Ammunition: ImageVector? = null
