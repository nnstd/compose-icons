package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Desk: ImageVector
    get() {
        if (_Desk != null) {
            return _Desk!!
        }
        _Desk = ImageVector.Builder(
            name = "Desk",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 6f)
                horizontalLineTo(21f)
                curveTo(21.55f, 6f, 22f, 6.45f, 22f, 7f)
                curveTo(22f, 7.55f, 21.55f, 8f, 21f, 8f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(3f)
                verticalLineTo(8f)
                curveTo(2.45f, 8f, 2f, 7.55f, 2f, 7f)
                curveTo(2f, 6.45f, 2.45f, 6f, 3f, 6f)
                moveTo(16f, 10.5f)
                verticalLineTo(11f)
                horizontalLineTo(18f)
                verticalLineTo(10.5f)
                curveTo(18f, 10.22f, 17.78f, 10f, 17.5f, 10f)
                horizontalLineTo(16.5f)
                curveTo(16.22f, 10f, 16f, 10.22f, 16f, 10.5f)
                moveTo(16f, 14.5f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                verticalLineTo(14.5f)
                curveTo(18f, 14.22f, 17.78f, 14f, 17.5f, 14f)
                horizontalLineTo(16.5f)
                curveTo(16.22f, 14f, 16f, 14.22f, 16f, 14.5f)
                close()
            }
        }.build()

        return _Desk!!
    }

@Suppress("ObjectPropertyName")
private var _Desk: ImageVector? = null
