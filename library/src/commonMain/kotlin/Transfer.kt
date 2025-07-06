package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Transfer: ImageVector
    get() {
        if (_Transfer != null) {
            return _Transfer!!
        }
        _Transfer = ImageVector.Builder(
            name = "Transfer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 6f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                horizontalLineTo(13.5f)
                lineTo(17f, 12.5f)
                lineTo(20.5f, 9f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 4f)
                horizontalLineTo(8f)
                moveTo(3f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(3f)
                moveTo(3f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                moveTo(13f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                moveTo(3f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                horizontalLineTo(3f)
                moveTo(13f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(21f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _Transfer!!
    }

@Suppress("ObjectPropertyName")
private var _Transfer: ImageVector? = null
