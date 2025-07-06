package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmailEdit: ImageVector
    get() {
        if (_EmailEdit != null) {
            return _EmailEdit!!
        }
        _EmailEdit = ImageVector.Builder(
            name = "EmailEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 12.13f)
                curveTo(20.85f, 12.14f, 20.71f, 12.19f, 20.61f, 12.3f)
                lineTo(19.61f, 13.3f)
                lineTo(21.66f, 15.3f)
                lineTo(22.66f, 14.3f)
                curveTo(22.88f, 14.09f, 22.88f, 13.74f, 22.66f, 13.53f)
                lineTo(21.42f, 12.3f)
                curveTo(21.32f, 12.19f, 21.18f, 12.14f, 21.04f, 12.13f)
                moveTo(19.04f, 13.88f)
                lineTo(13f, 19.94f)
                verticalLineTo(22f)
                horizontalLineTo(15.06f)
                lineTo(21.12f, 15.93f)
                moveTo(20f, 4f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 20f)
                horizontalLineTo(11f)
                verticalLineTo(19.11f)
                lineTo(19.24f, 10.89f)
                curveTo(19.71f, 10.4f, 20.36f, 10.13f, 21.04f, 10.13f)
                curveTo(21.38f, 10.13f, 21.72f, 10.19f, 22.04f, 10.32f)
                verticalLineTo(6f)
                curveTo(22.04f, 4.88f, 21.12f, 4f, 20f, 4f)
                moveTo(20f, 8f)
                lineTo(12f, 13f)
                lineTo(4f, 8f)
                verticalLineTo(6f)
                lineTo(12f, 11f)
                lineTo(20f, 6f)
            }
        }.build()

        return _EmailEdit!!
    }

@Suppress("ObjectPropertyName")
private var _EmailEdit: ImageVector? = null
