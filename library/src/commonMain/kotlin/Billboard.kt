package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Billboard: ImageVector
    get() {
        if (_Billboard != null) {
            return _Billboard!!
        }
        _Billboard = ImageVector.Builder(
            name = "Billboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 22f)
                horizontalLineTo(18f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                moveTo(6f, 22f)
                horizontalLineTo(4f)
                verticalLineTo(17f)
                horizontalLineTo(6f)
                moveTo(23f, 4f)
                verticalLineTo(13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 15f)
                horizontalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 13f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 2f)
                horizontalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 4f)
                moveTo(21f, 4f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                horizontalLineTo(21f)
                moveTo(20f, 6f)
                horizontalLineTo(15f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                moveTo(18f, 9f)
                horizontalLineTo(15f)
                verticalLineTo(11f)
                horizontalLineTo(18f)
                moveTo(14f, 11f)
                horizontalLineTo(4f)
                lineTo(6.73f, 7.36f)
                lineTo(8.73f, 10.09f)
                lineTo(9.46f, 9.55f)
                lineTo(8.2f, 7.82f)
                lineTo(9.91f, 5.55f)
                close()
            }
        }.build()

        return _Billboard!!
    }

@Suppress("ObjectPropertyName")
private var _Billboard: ImageVector? = null
