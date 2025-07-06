package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ViewWeekOutline: ImageVector
    get() {
        if (_ViewWeekOutline != null) {
            return _ViewWeekOutline!!
        }
        _ViewWeekOutline = ImageVector.Builder(
            name = "ViewWeekOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 4f)
                horizontalLineTo(3f)
                curveTo(2.45f, 4f, 2f, 4.45f, 2f, 5f)
                verticalLineTo(19f)
                curveTo(2f, 19.55f, 2.45f, 20f, 3f, 20f)
                horizontalLineTo(21f)
                curveTo(21.55f, 20f, 22f, 19.55f, 22f, 19f)
                verticalLineTo(5f)
                curveTo(22f, 4.45f, 21.55f, 4f, 21f, 4f)
                moveTo(8f, 18f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineTo(8f)
                verticalLineTo(18f)
                moveTo(14f, 18f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                moveTo(20f, 18f)
                horizontalLineTo(16f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _ViewWeekOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ViewWeekOutline: ImageVector? = null
