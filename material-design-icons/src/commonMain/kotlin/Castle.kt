package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Castle: ImageVector
    get() {
        if (_Castle != null) {
            return _Castle!!
        }
        _Castle = ImageVector.Builder(
            name = "Castle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 13f)
                horizontalLineTo(4f)
                verticalLineTo(15f)
                horizontalLineTo(6f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                verticalLineTo(13f)
                horizontalLineTo(12f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                lineTo(17f, 7f)
                verticalLineTo(1f)
                horizontalLineTo(19f)
                lineTo(23f, 3f)
                lineTo(19f, 5f)
                verticalLineTo(7f)
                lineTo(22f, 10f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 19f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                verticalLineTo(13f)
                moveTo(18f, 10f)
                curveTo(17.45f, 10f, 17f, 10.54f, 17f, 11.2f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(11.2f)
                curveTo(19f, 10.54f, 18.55f, 10f, 18f, 10f)
                close()
            }
        }.build()

        return _Castle!!
    }

@Suppress("ObjectPropertyName")
private var _Castle: ImageVector? = null
