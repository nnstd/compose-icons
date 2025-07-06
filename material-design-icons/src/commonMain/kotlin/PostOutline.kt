package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PostOutline: ImageVector
    get() {
        if (_PostOutline != null) {
            return _PostOutline!!
        }
        _PostOutline = ImageVector.Builder(
            name = "PostOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 5f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                moveTo(21f, 3f)
                horizontalLineTo(3f)
                verticalLineTo(21f)
                horizontalLineTo(21f)
                verticalLineTo(3f)
                moveTo(17f, 17f)
                horizontalLineTo(7f)
                verticalLineTo(16f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                moveTo(17f, 15f)
                horizontalLineTo(7f)
                verticalLineTo(14f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                moveTo(17f, 12f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _PostOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PostOutline: ImageVector? = null
