package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SourceCommitStart: ImageVector
    get() {
        if (_SourceCommitStart != null) {
            return _SourceCommitStart!!
        }
        _SourceCommitStart = ImageVector.Builder(
            name = "SourceCommitStart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 12f)
                curveTo(17f, 14.42f, 15.28f, 16.44f, 13f, 16.9f)
                verticalLineTo(21f)
                horizontalLineTo(11f)
                verticalLineTo(16.9f)
                curveTo(8.72f, 16.44f, 7f, 14.42f, 7f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 7f)
                moveTo(12f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9f)
                close()
            }
        }.build()

        return _SourceCommitStart!!
    }

@Suppress("ObjectPropertyName")
private var _SourceCommitStart: ImageVector? = null
