package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PencilBoxMultiple: ImageVector
    get() {
        if (_PencilBoxMultiple != null) {
            return _PencilBoxMultiple!!
        }
        _PencilBoxMultiple = ImageVector.Builder(
            name = "PencilBoxMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.22f, 2f)
                horizontalLineTo(7.78f)
                curveTo(6.8f, 2f, 6f, 2.8f, 6f, 3.78f)
                verticalLineTo(16.22f)
                curveTo(6f, 17.2f, 6.8f, 18f, 7.78f, 18f)
                horizontalLineTo(20.22f)
                curveTo(21.2f, 18f, 22f, 17.21f, 22f, 16.22f)
                verticalLineTo(3.78f)
                curveTo(22f, 2.8f, 21.2f, 2f, 20.22f, 2f)
                moveTo(11.06f, 15f)
                horizontalLineTo(9f)
                verticalLineTo(12.94f)
                lineTo(15.06f, 6.88f)
                lineTo(17.12f, 8.94f)
                lineTo(11.06f, 15f)
                moveTo(18.7f, 7.35f)
                lineTo(17.7f, 8.35f)
                lineTo(15.65f, 6.3f)
                lineTo(16.65f, 5.3f)
                curveTo(16.86f, 5.08f, 17.21f, 5.08f, 17.42f, 5.3f)
                lineTo(18.7f, 6.58f)
                curveTo(18.92f, 6.79f, 18.92f, 7.14f, 18.7f, 7.35f)
                moveTo(4f, 6f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                curveTo(2f, 21.11f, 2.9f, 22f, 4f, 22f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _PencilBoxMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _PencilBoxMultiple: ImageVector? = null
