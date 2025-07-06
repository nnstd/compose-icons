package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SelectMultiple: ImageVector
    get() {
        if (_SelectMultiple != null) {
            return _SelectMultiple!!
        }
        _SelectMultiple = ImageVector.Builder(
            name = "SelectMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 12f)
                horizontalLineTo(20f)
                verticalLineTo(14f)
                horizontalLineTo(18f)
                verticalLineTo(12f)
                moveTo(14f, 16f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                horizontalLineTo(14f)
                verticalLineTo(16f)
                moveTo(20f, 17f)
                curveTo(20f, 17.55f, 19.55f, 18f, 19f, 18f)
                horizontalLineTo(18f)
                verticalLineTo(16f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                moveTo(7f, 4f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                horizontalLineTo(6f)
                verticalLineTo(5f)
                curveTo(6f, 4.45f, 6.45f, 4f, 7f, 4f)
                moveTo(19f, 4f)
                curveTo(19.55f, 4f, 20f, 4.45f, 20f, 5f)
                verticalLineTo(6f)
                horizontalLineTo(18f)
                verticalLineTo(4f)
                horizontalLineTo(19f)
                moveTo(14f, 6f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                moveTo(10f, 6f)
                verticalLineTo(4f)
                horizontalLineTo(12f)
                verticalLineTo(6f)
                horizontalLineTo(10f)
                moveTo(10f, 18f)
                verticalLineTo(16f)
                horizontalLineTo(12f)
                verticalLineTo(18f)
                horizontalLineTo(10f)
                moveTo(7f, 18f)
                curveTo(6.45f, 18f, 6f, 17.55f, 6f, 17f)
                verticalLineTo(16f)
                horizontalLineTo(8f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                moveTo(6f, 12f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                moveTo(6f, 8f)
                horizontalLineTo(8f)
                verticalLineTo(10f)
                horizontalLineTo(6f)
                verticalLineTo(8f)
                moveTo(20f, 8f)
                verticalLineTo(10f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                moveTo(3f, 8f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                verticalLineTo(21f)
                curveTo(16f, 21.54f, 15.57f, 22f, 15.03f, 22f)
                horizontalLineTo(15f)
                lineTo(3f, 22f)
                curveTo(2.45f, 22f, 2f, 21.55f, 2f, 21f)
                verticalLineTo(9f)
                curveTo(2f, 8.45f, 2.45f, 8f, 3f, 8f)
                close()
            }
        }.build()

        return _SelectMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _SelectMultiple: ImageVector? = null
