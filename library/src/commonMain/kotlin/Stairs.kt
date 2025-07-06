package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Stairs: ImageVector
    get() {
        if (_Stairs != null) {
            return _Stairs!!
        }
        _Stairs = ImageVector.Builder(
            name = "Stairs",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 5f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(3f)
                verticalLineTo(20f)
                horizontalLineTo(10f)
                verticalLineTo(16f)
                horizontalLineTo(14f)
                verticalLineTo(12f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                horizontalLineTo(22f)
                verticalLineTo(5f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _Stairs!!
    }

@Suppress("ObjectPropertyName")
private var _Stairs: ImageVector? = null
