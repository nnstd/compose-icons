package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SourceCommitEnd: ImageVector
    get() {
        if (_SourceCommitEnd != null) {
            return _SourceCommitEnd!!
        }
        _SourceCommitEnd = ImageVector.Builder(
            name = "SourceCommitEnd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 17f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 12f)
                curveTo(7f, 9.58f, 8.72f, 7.56f, 11f, 7.1f)
                verticalLineTo(3f)
                horizontalLineTo(13f)
                verticalLineTo(7.1f)
                curveTo(15.28f, 7.56f, 17f, 9.58f, 17f, 12f)
                moveTo(12f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9f)
                close()
            }
        }.build()

        return _SourceCommitEnd!!
    }

@Suppress("ObjectPropertyName")
private var _SourceCommitEnd: ImageVector? = null
