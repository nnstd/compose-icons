package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShoeHeel: ImageVector
    get() {
        if (_ShoeHeel != null) {
            return _ShoeHeel!!
        }
        _ShoeHeel = ImageVector.Builder(
            name = "ShoeHeel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 18f)
                horizontalLineTo(11.7f)
                lineTo(17f, 14f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(14f)
                curveTo(20f, 14f, 21f, 12f, 21f, 10f)
                curveTo(21f, 8f, 20.5f, 6f, 20.5f, 6f)
                horizontalLineTo(18.5f)
                lineTo(18f, 7f)
                lineTo(10f, 14f)
                horizontalLineTo(8f)
                lineTo(3f, 16f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _ShoeHeel!!
    }

@Suppress("ObjectPropertyName")
private var _ShoeHeel: ImageVector? = null
