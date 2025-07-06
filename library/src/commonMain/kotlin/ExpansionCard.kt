package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ExpansionCard: ImageVector
    get() {
        if (_ExpansionCard != null) {
            return _ExpansionCard!!
        }
        _ExpansionCard = ImageVector.Builder(
            name = "ExpansionCard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 7f)
                verticalLineTo(8.5f)
                horizontalLineTo(3f)
                verticalLineTo(17f)
                horizontalLineTo(4.5f)
                verticalLineTo(7f)
                curveTo(3.7f, 7f, 2.8f, 7f, 2f, 7f)
                moveTo(6f, 7f)
                verticalLineTo(7f)
                lineTo(6f, 16f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(14f)
                verticalLineTo(16f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                horizontalLineTo(6f)
                moveTo(17.5f, 9f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 11.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 14f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 11.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 9f)
                close()
            }
        }.build()

        return _ExpansionCard!!
    }

@Suppress("ObjectPropertyName")
private var _ExpansionCard: ImageVector? = null
