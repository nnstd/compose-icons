package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RelationOneToMany: ImageVector
    get() {
        if (_RelationOneToMany != null) {
            return _RelationOneToMany!!
        }
        _RelationOneToMany = ImageVector.Builder(
            name = "RelationOneToMany",
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
                horizontalLineTo(19f)
                lineTo(21f, 13f)
                close()
            }
        }.build()

        return _RelationOneToMany!!
    }

@Suppress("ObjectPropertyName")
private var _RelationOneToMany: ImageVector? = null
