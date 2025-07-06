package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ViewDayOutline: ImageVector
    get() {
        if (_ViewDayOutline != null) {
            return _ViewDayOutline!!
        }
        _ViewDayOutline = ImageVector.Builder(
            name = "ViewDayOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 18f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                horizontalLineTo(21f)
                verticalLineTo(18f)
                moveTo(19f, 10f)
                verticalLineTo(14f)
                horizontalLineTo(4f)
                verticalLineTo(10f)
                horizontalLineTo(19f)
                moveTo(20f, 8f)
                horizontalLineTo(3f)
                curveTo(2.45f, 8f, 2f, 8.45f, 2f, 9f)
                verticalLineTo(15f)
                curveTo(2f, 15.55f, 2.45f, 16f, 3f, 16f)
                horizontalLineTo(20f)
                curveTo(20.55f, 16f, 21f, 15.55f, 21f, 15f)
                verticalLineTo(9f)
                curveTo(21f, 8.45f, 20.55f, 8f, 20f, 8f)
                moveTo(21f, 4f)
                horizontalLineTo(2f)
                verticalLineTo(6f)
                horizontalLineTo(21f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _ViewDayOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ViewDayOutline: ImageVector? = null
