package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RelationOneOrManyToOne: ImageVector
    get() {
        if (_RelationOneOrManyToOne != null) {
            return _RelationOneOrManyToOne!!
        }
        _RelationOneOrManyToOne = ImageVector.Builder(
            name = "RelationOneOrManyToOne",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                lineTo(3f, 11f)
                horizontalLineTo(2f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                lineTo(5f, 7f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _RelationOneOrManyToOne!!
    }

@Suppress("ObjectPropertyName")
private var _RelationOneOrManyToOne: ImageVector? = null
