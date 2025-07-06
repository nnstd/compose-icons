package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BreadSliceOutline: ImageVector
    get() {
        if (_BreadSliceOutline != null) {
            return _BreadSliceOutline!!
        }
        _BreadSliceOutline = ImageVector.Builder(
            name = "BreadSliceOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(17.5f, 2f, 22f, 5.36f, 22f, 9.5f)
                curveTo(22f, 11.19f, 21.26f, 12.75f, 20f, 14f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                verticalLineTo(14f)
                curveTo(2.74f, 12.75f, 2f, 11.19f, 2f, 9.5f)
                curveTo(2f, 5.36f, 6.5f, 2f, 12f, 2f)
                moveTo(18f, 13.14f)
                curveTo(19.24f, 12.17f, 20f, 10.89f, 20f, 9.5f)
                curveTo(20f, 6.46f, 16.42f, 4f, 12f, 4f)
                curveTo(7.58f, 4f, 4f, 6.46f, 4f, 9.5f)
                curveTo(4f, 10.89f, 4.76f, 12.17f, 6f, 13.14f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(13.14f)
                moveTo(8f, 18f)
                verticalLineTo(14f)
                horizontalLineTo(12f)
                verticalLineTo(18f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _BreadSliceOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BreadSliceOutline: ImageVector? = null
