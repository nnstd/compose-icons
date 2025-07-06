package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RelationZeroOrOneToZeroOrOne: ImageVector
    get() {
        if (_RelationZeroOrOneToZeroOrOne != null) {
            return _RelationZeroOrOneToZeroOrOne!!
        }
        _RelationZeroOrOneToZeroOrOne = ImageVector.Builder(
            name = "RelationZeroOrOneToZeroOrOne",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 15f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                horizontalLineTo(18.79f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.21f, 15f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(9.79f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.21f, 7f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                horizontalLineTo(2f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(5.21f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.79f, 9f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(14.21f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.79f, 17f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                verticalLineTo(15f)
                moveTo(7.5f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8.5f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 9f)
                moveTo(16.5f, 17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 17.5f, 16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 17f)
                close()
            }
        }.build()

        return _RelationZeroOrOneToZeroOrOne!!
    }

@Suppress("ObjectPropertyName")
private var _RelationZeroOrOneToZeroOrOne: ImageVector? = null
