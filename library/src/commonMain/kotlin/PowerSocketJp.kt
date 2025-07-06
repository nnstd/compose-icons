package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PowerSocketJp: ImageVector
    get() {
        if (_PowerSocketJp != null) {
            return _PowerSocketJp!!
        }
        _PowerSocketJp = ImageVector.Builder(
            name = "PowerSocketJp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 9.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(8f)
                verticalLineTo(9.5f)
                moveTo(19.78f, 2f)
                curveTo(21f, 2f, 22f, 3f, 22f, 4.22f)
                verticalLineTo(19.78f)
                curveTo(22f, 21f, 21f, 22f, 19.78f, 22f)
                horizontalLineTo(4.22f)
                curveTo(3f, 22f, 2f, 21f, 2f, 19.78f)
                verticalLineTo(4.22f)
                curveTo(2f, 3f, 3f, 2f, 4.22f, 2f)
                moveTo(12f, 4f)
                curveTo(7.58f, 4f, 4f, 7.58f, 4f, 12f)
                curveTo(4f, 16.42f, 7.58f, 20f, 12f, 20f)
                curveTo(16.42f, 20f, 20f, 16.42f, 20f, 12f)
                curveTo(20f, 7.58f, 16.42f, 4f, 12f, 4f)
                moveTo(16f, 9.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(14f)
                verticalLineTo(9.5f)
                close()
            }
        }.build()

        return _PowerSocketJp!!
    }

@Suppress("ObjectPropertyName")
private var _PowerSocketJp: ImageVector? = null
