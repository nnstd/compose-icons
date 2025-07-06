package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RelationOneToOneOrMany: ImageVector
    get() {
        if (_RelationOneToOneOrMany != null) {
            return _RelationOneToOneOrMany!!
        }
        _RelationOneToOneOrMany = ImageVector.Builder(
            name = "RelationOneToOneOrMany",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 13f)
                verticalLineTo(19f)
                horizontalLineTo(21f)
                lineTo(19f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(2f)
                verticalLineTo(7f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                lineTo(21f, 13f)
                close()
            }
        }.build()

        return _RelationOneToOneOrMany!!
    }

@Suppress("ObjectPropertyName")
private var _RelationOneToOneOrMany: ImageVector? = null
