package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RelationZeroOrManyToOnlyOne: ImageVector
    get() {
        if (_RelationZeroOrManyToOnlyOne != null) {
            return _RelationZeroOrManyToOnlyOne!!
        }
        _RelationZeroOrManyToOnlyOne = ImageVector.Builder(
            name = "RelationZeroOrManyToOnlyOne",
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
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(9.79f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.21f, 7f)
                horizontalLineTo(5f)
                lineTo(3f, 5f)
                horizontalLineTo(2f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                lineTo(5f, 9f)
                horizontalLineTo(5.21f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.79f, 9f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(16f)
                verticalLineTo(19f)
                horizontalLineTo(18f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                verticalLineTo(15f)
                moveTo(7.5f, 9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8.5f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 9f)
                close()
            }
        }.build()

        return _RelationZeroOrManyToOnlyOne!!
    }

@Suppress("ObjectPropertyName")
private var _RelationZeroOrManyToOnlyOne: ImageVector? = null
