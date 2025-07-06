package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Buffet: ImageVector
    get() {
        if (_Buffet != null) {
            return _Buffet!!
        }
        _Buffet = ImageVector.Builder(
            name = "Buffet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 14f)
                curveTo(9.55f, 14f, 10f, 14.45f, 10f, 15f)
                curveTo(10f, 15.55f, 9.55f, 16f, 9f, 16f)
                curveTo(8.45f, 16f, 8f, 15.55f, 8f, 15f)
                curveTo(8f, 14.45f, 8.45f, 14f, 9f, 14f)
                moveTo(15f, 14f)
                curveTo(15.55f, 14f, 16f, 14.45f, 16f, 15f)
                curveTo(16f, 15.55f, 15.55f, 16f, 15f, 16f)
                curveTo(14.45f, 16f, 14f, 15.55f, 14f, 15f)
                curveTo(14f, 14.45f, 14.45f, 14f, 15f, 14f)
                moveTo(3f, 22f)
                lineTo(4f, 19f)
                horizontalLineTo(3f)
                curveTo(2.45f, 19f, 2f, 18.55f, 2f, 18f)
                verticalLineTo(12f)
                curveTo(2f, 11.45f, 2.45f, 11f, 3f, 11f)
                horizontalLineTo(21f)
                curveTo(21.55f, 11f, 22f, 11.45f, 22f, 12f)
                verticalLineTo(18f)
                curveTo(22f, 18.55f, 21.55f, 19f, 21f, 19f)
                horizontalLineTo(20f)
                lineTo(21f, 22f)
                horizontalLineTo(19f)
                lineTo(18f, 19f)
                horizontalLineTo(6f)
                lineTo(5f, 22f)
                horizontalLineTo(3f)
                moveTo(13f, 13f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                moveTo(4f, 13f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _Buffet!!
    }

@Suppress("ObjectPropertyName")
private var _Buffet: ImageVector? = null
