package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CircleSlice1: ImageVector
    get() {
        if (_CircleSlice1 != null) {
            return _CircleSlice1!!
        }
        _CircleSlice1 = ImageVector.Builder(
            name = "CircleSlice1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(17.5f, 2f, 22f, 6.5f, 22f, 12f)
                curveTo(22f, 17.5f, 17.5f, 22f, 12f, 22f)
                curveTo(6.5f, 22f, 2f, 17.5f, 2f, 12f)
                curveTo(2f, 6.5f, 6.5f, 2f, 12f, 2f)
                moveTo(12f, 4f)
                curveTo(7.58f, 4f, 4f, 7.58f, 4f, 12f)
                curveTo(4f, 16.42f, 7.58f, 20f, 12f, 20f)
                curveTo(16.42f, 20f, 20f, 16.42f, 20f, 12f)
                curveTo(20f, 7.58f, 16.42f, 4f, 12f, 4f)
                moveTo(12f, 5f)
                curveTo(13.93f, 5f, 15.68f, 5.78f, 16.95f, 7.05f)
                lineTo(12f, 12f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _CircleSlice1!!
    }

@Suppress("ObjectPropertyName")
private var _CircleSlice1: ImageVector? = null
