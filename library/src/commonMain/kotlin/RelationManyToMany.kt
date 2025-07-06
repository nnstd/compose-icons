package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RelationManyToMany: ImageVector
    get() {
        if (_RelationManyToMany != null) {
            return _RelationManyToMany!!
        }
        _RelationManyToMany = ImageVector.Builder(
            name = "RelationManyToMany",
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
                horizontalLineTo(5f)
                lineTo(3f, 11f)
                horizontalLineTo(2f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                lineTo(5f, 7f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                lineTo(21f, 13f)
                close()
            }
        }.build()

        return _RelationManyToMany!!
    }

@Suppress("ObjectPropertyName")
private var _RelationManyToMany: ImageVector? = null
