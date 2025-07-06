package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.IronOutline: ImageVector
    get() {
        if (_IronOutline != null) {
            return _IronOutline!!
        }
        _IronOutline = ImageVector.Builder(
            name = "IronOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 6f)
                curveTo(19.34f, 6f, 18f, 7.34f, 18f, 9f)
                verticalLineTo(13f)
                curveTo(18f, 13.55f, 17.55f, 14f, 17f, 14f)
                verticalLineTo(10f)
                curveTo(17f, 8.34f, 15.66f, 7f, 14f, 7f)
                horizontalLineTo(10f)
                curveTo(8.34f, 7f, 7f, 8.34f, 7f, 10f)
                horizontalLineTo(9f)
                curveTo(9f, 9.45f, 9.45f, 9f, 10f, 9f)
                horizontalLineTo(14f)
                curveTo(14.55f, 9f, 15f, 9.45f, 15f, 10f)
                verticalLineTo(11f)
                horizontalLineTo(6f)
                curveTo(3.79f, 11f, 2f, 12.79f, 2f, 15f)
                verticalLineTo(18f)
                horizontalLineTo(17f)
                verticalLineTo(16f)
                curveTo(18.66f, 16f, 20f, 14.66f, 20f, 13f)
                verticalLineTo(9f)
                curveTo(20f, 8.45f, 20.45f, 8f, 21f, 8f)
                horizontalLineTo(22f)
                verticalLineTo(6f)
                horizontalLineTo(21f)
                moveTo(15f, 16f)
                horizontalLineTo(4f)
                verticalLineTo(15f)
                curveTo(4f, 13.9f, 4.9f, 13f, 6f, 13f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _IronOutline!!
    }

@Suppress("ObjectPropertyName")
private var _IronOutline: ImageVector? = null
