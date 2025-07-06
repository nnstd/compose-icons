package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Routes: ImageVector
    get() {
        if (_Routes != null) {
            return _Routes!!
        }
        _Routes = ImageVector.Builder(
            name = "Routes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 10f)
                horizontalLineTo(5f)
                lineTo(3f, 8f)
                lineTo(5f, 6f)
                horizontalLineTo(11f)
                verticalLineTo(3f)
                lineTo(12f, 2f)
                lineTo(13f, 3f)
                verticalLineTo(4f)
                horizontalLineTo(19f)
                lineTo(21f, 6f)
                lineTo(19f, 8f)
                horizontalLineTo(13f)
                verticalLineTo(10f)
                horizontalLineTo(19f)
                lineTo(21f, 12f)
                lineTo(19f, 14f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 22f)
                horizontalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 20f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _Routes!!
    }

@Suppress("ObjectPropertyName")
private var _Routes: ImageVector? = null
