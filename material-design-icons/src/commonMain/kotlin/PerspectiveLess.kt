package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PerspectiveLess: ImageVector
    get() {
        if (_PerspectiveLess != null) {
            return _PerspectiveLess!!
        }
        _PerspectiveLess = ImageVector.Builder(
            name = "PerspectiveLess",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.56f, 12f)
                lineTo(19.23f, 20f)
                horizontalLineTo(4.78f)
                lineTo(7.44f, 12f)
                horizontalLineTo(16.56f)
                moveTo(7f, 1f)
                lineTo(3f, 5f)
                lineTo(7f, 9f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                horizontalLineTo(7f)
                verticalLineTo(1f)
                moveTo(17f, 1f)
                verticalLineTo(4f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                lineTo(21f, 5f)
                lineTo(17f, 1f)
                moveTo(18f, 10f)
                horizontalLineTo(6f)
                lineTo(2f, 22f)
                horizontalLineTo(22f)
                lineTo(18f, 10f)
                close()
            }
        }.build()

        return _PerspectiveLess!!
    }

@Suppress("ObjectPropertyName")
private var _PerspectiveLess: ImageVector? = null
