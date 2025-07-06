package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ViewCompactOutline: ImageVector
    get() {
        if (_ViewCompactOutline != null) {
            return _ViewCompactOutline!!
        }
        _ViewCompactOutline = ImageVector.Builder(
            name = "ViewCompactOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 5f)
                verticalLineTo(19f)
                horizontalLineTo(22f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                moveTo(5f, 7f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                moveTo(5f, 17f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                moveTo(11f, 17f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _ViewCompactOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ViewCompactOutline: ImageVector? = null
